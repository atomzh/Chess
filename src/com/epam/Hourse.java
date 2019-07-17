package com.epam;

public class Hourse {
    private int n;
    private int[][] board;
    private int width;
    private int height;
    private int x;
    private int y;

    public Hourse(int width,int height, int x, int y) {
        board = new int [width][height];
        n=width*height;
        this.x = x-1;
        this.y = y-1;
        this.width=width;
        this.height=height;
    }


    public void getResult(){
        for (int i = 0; i <width; i++) {
            for (int j = 0; j <height; j++) {
                System.out.print(" {"+board[i][j]+"}");
            }
            System.out.println();
        }
    }


    public void nextStep(){
        int[][] steps = {{x-2,y+1},{x-2,y-1},{x+2,y+1},{x+2,y-1},{x+1,y+2},{x-1,y+2},{x+1,y-2},{x-1,y-2}};
        int[][] correctSteps = new int[8][2];
        int k = 0;
        for (int i = 0; i < steps.length; i++) {
            if (steps[i][0]<8 && steps[i][0]>=0 && steps[i][1]<8 && steps[i][1]>=0 && board[steps[i][0]][steps[i][1]]==0){
                    correctSteps[k][0] = steps[i][0];
                    correctSteps[k][1] = steps[i][1];
                    k++;
                }
            }


        int min=7;
        int quantitySteps;
        int hereX=0;
        int hereY=0;
        for (int i = 0; i <k ; i++) {
            quantitySteps = stepFinder(correctSteps[i][0],correctSteps[i][1]);
            if(quantitySteps<min){
                min=quantitySteps;
                hereX = correctSteps[i][0] ;
                hereY = correctSteps[i][1] ;
            }
        }
        x=hereX;
        y=hereY;
    }

    public int stepFinder(int x,int y){
        int[][] steps = {{x-2,y+1},{x-2,y-1},{x+2,y+1},{x+2,y-1},{x+1,y+2},{x-1,y+2},{x+1,y-2},{x-1,y-2}};
        int quantityOfSteps = 0;
        for (int i = 0; i < steps.length; i++) {
            if (steps[i][0]<8 && steps[i][0]>=0 && steps[i][1]<8 && steps[i][1]>=0 && board[steps[i][0]][steps[i][1]]==0){

                    quantityOfSteps++;

            }
        }
        return(quantityOfSteps);
    }


    public void startWorking(){
        for (int i = 1; i <=n ; i++) {
           if (board[x][y]==0){
                board[x][y]=i;
            }
            System.out.print(board[x][y]);
            System.out.println(") "+x+" "+y+" | ");

            nextStep();
        }
    }
}
