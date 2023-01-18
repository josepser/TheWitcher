package github;

public class main {

		public static void main(String[] args) {
			TheWitcher brujo = new TheWitcher();
			brujo.setName("Geralt de Rivia");
			brujo.setHealth(1);
			brujo.setHasSoul(true);
			if(brujo.isDeath()) {
				System.out.println(brujo.getName()+" está muerto");
			}else {
				System.out.println(brujo.getName()+" está vivo");
			}
		}
	}


