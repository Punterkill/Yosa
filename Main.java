public class Main {
		public static void main(String[] args) {
			Yosa y = new Yosa(new Dados("Yosa", 20, 1.80, "05/11/2006", "Branco"), new Atributos(11, 20, 15, 200), new Itens("Excalibur", 100, "Lendário"));
			System.out.println(y.toString());
	}
}
	
