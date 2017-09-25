import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();

        //Row Column coordinates of the closes object in each direction
        int rROb = -1;
        int cROb = -1;
        int rBROb = -1;
        int cBROb = -1;
        int rBOb = -1;
        int cBOb = -1;
        int rBLOb = -1;
        int cBLOb = -1;
        int rLOb = -1;
        int cLOb = -1;
        int rTLOb = -1;
        int cTLOb = -1;
        int rTOb = -1;
        int cTOb = -1;
        int rTROb = -1;
        int cTROb = -1;

        //Total squares attacked by the queen
        int reachableSquares = 0;

        //Finds the closest object in each direction
        for(int a0 = 0; a0 < k; a0++){
            int rOb = in.nextInt();
            int cOb = in.nextInt();

            //Right
            if((cOb < cROb || rROb == -1) && cOb > cQueen && rOb == rQueen)
            {
                rROb = rOb;
                cROb = cOb;
            }

            //Bottom Right
            if(rQueen - rOb == cOb - cQueen && cOb > cQueen && rOb < rQueen
                    && ((rOb > rBROb && cOb < cBROb) || rBROb == -1))
            {
                rBROb = rOb;
                cBROb = cOb;
            }

            //Bottom    
            if((rOb > rBOb || rBOb == -1) && rOb < rQueen && cOb == cQueen)
            {
                rBOb = rOb;
                cBOb = cOb;
            }

            //Bottom Left
            if(rQueen - rOb == cQueen - cOb && cOb < cQueen && rOb < rQueen
                    && ((rOb > rBLOb && cOb > cBLOb) || rBLOb == -1))
            {
                rBLOb = rOb;
                cBLOb = cOb;
            }

            //Left
            if((cOb > cLOb || rLOb == -1) && cOb < cQueen && rOb == rQueen)
            {
                rLOb = rOb;
                cLOb = cOb;
            }

            //Top Left
            if(cQueen - cOb == rOb - rQueen && cOb < cQueen && rOb > rQueen
                    && ((rOb < rTLOb && cOb > cTLOb) || rTLOb == -1))
            {
                rTLOb = rOb;
                cTLOb = cOb;
            }

            //Top
            if((rOb < rTOb || rTOb == -1) && rOb > rQueen && cOb == cQueen)
            {
                rTOb = rOb;
                cTOb = cOb;
            }

            //Top Right
            if(rOb - rQueen == cOb - cQueen && cOb > cQueen
                    && rOb > rQueen && ((rOb < rTROb && cOb < cTROb) || rTROb == -1))
            {
                rTROb = rOb;
                cTROb = cOb;
            }

        }

        //Calculates the distance to the closest obstacle in each direction and adds it to reachableSquares
        //R B L T
        reachableSquares += (cROb != -1) ? (cROb - cQueen -1) : n - cQueen;
        reachableSquares += (rBOb != -1) ? (rQueen - rBOb - 1) : rQueen - 1;
        reachableSquares += (cLOb != -1) ? (cQueen - cLOb -1) : cQueen - 1;
        reachableSquares += (rTOb != -1) ? (rTOb - rQueen - 1) : n - rQueen;

        //BR BL TL TR
        reachableSquares += (cBROb != -1) ? (cBROb - cQueen -1) : Math.min(n - cQueen, rQueen - 1);
        reachableSquares += (rBLOb != -1) ? (cQueen - cBLOb - 1) : Math.min(cQueen - 1, rQueen - 1);
        reachableSquares += (cTLOb != -1) ? (cQueen - cTLOb -1) : Math.min(cQueen - 1, n - rQueen);
        reachableSquares += (rTROb != -1) ? (cTROb - cQueen - 1) : Math.min(n - cQueen, n - rQueen);
        System.out.println(reachableSquares);
    }
}
