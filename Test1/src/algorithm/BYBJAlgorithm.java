package algorithm;

public class BYBJAlgorithm {

	public static void main(String[] args) {
		//现在有100元，要买100只鸡，公鸡5元一只，母鸡3元一只，小鸡1元三只，求公鸡，母鸡，小鸡各几只
		int gongji1 = 0;
		int muji1 = 0;
		int xiaoji1 = 0;
		for(gongji1 = 0;gongji1 < 20; gongji1++){
			for (muji1 = 0; muji1 < 33; muji1++) {
				for (xiaoji1 = 0; xiaoji1 < 100; xiaoji1++) {
					if (gongji1*5+muji1*3+xiaoji1/3 == 100 && gongji1+muji1+xiaoji1 == 100 && xiaoji1%3==0) {
						System.out.println("公鸡是："+gongji1+"只，母鸡是"+muji1+"只，小鸡是："+xiaoji1+"只");
					}
				}
			}
		}

		System.out.println("第二种方法:");
		int gongji2 = 0;
		int muji2 = 0;
		int xiaoji2 = 0;
		for (gongji2 = 0; gongji2 < 20; gongji2++) {
            for (muji2 = 0; muji2 < 33; muji2++) {
				xiaoji2 = 100-gongji2-muji2;
				if(gongji2*5+muji2*3+xiaoji2/3==100 && gongji2+muji2+xiaoji2==100 && xiaoji2%3==0){
					System.out.println("公鸡是："+gongji2+"只，母鸡是"+muji2+"只，小鸡是："+xiaoji2+"只");
				}
			}
		}
	}

}
