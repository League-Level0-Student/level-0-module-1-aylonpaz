package _05_for_loops._2_badgers;

public class Badger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int idk=0;idk<2;idk+=1) {
			for(int song=0;song<12;song+=1){
				System.out.print("Badger");
				if(song<11) {
					System.out.print(", ");
				}
			}
			System.out.println();
			for(int shroom =0; shroom <2; shroom +=1) {
				System.out.print("Mushrooms");
				if(shroom <1) {
					System.out.print(", ");
				}
			}
			System.out.println();
			System.out.println();
		}

		System.out.println("Snake!");
	}

}
