package Data_Structure.score;

public class ScoreTest02 {
	public static void main(String[] args){
        double score[][] = { {3.3,3.4,0.0}, {3.5, 3.6,0.0}, {3.7,4.0,0.0}, {4.1, 4.2,0.0}, {0.0,0.0,0.0}};
        double sum_avg = 0;
        double sum_first = 0;
        double sum_sec = 0;

        for(int year =0; year<score.length-1; year++){
            for(int term=0; term<score[year].length-1; term++){ //학기별로
                score[year][2] += (score[year][term]*10);
                

            }
            sum_avg += (score[year][2]*10);
            score[year][2] = (score[year][2]/(score[0].length-1))/10;
            sum_first += score[year][0]*10;
            sum_sec += score[year][1]*10;
        }
        
        score[score.length-1][0] = sum_first/ (score.length-1)/10;
        score[score.length-1][1] = sum_sec/(score.length-1)/10;
        score[score.length-1][2] = sum_avg/(score.length-1)*2/10;

        System.out.println("학년 1학기 2학기 평균");
        System.out.println("-----------------------");
        for(int i=0; i<score.length; i++){
           
            if( i<score.length-1){
                System.out.print(i+1 + "학년 |");
            }else{
                System.out.print("전체  |");
            }
           
            for(int j=0; j<score[i].length; j++){   

                    System.out.print(score[i][j] + " |");
                
            }
            System.out.println();
        }
    }

}
