package bu_mudur;

public class Src {

	public static void main(String[] args) {
		
		Deneme.Staticccc();// static fonskyon oldugu icin hehrnagi bir instance olusturmadan kullanabildik.
		
		Deneme deneme = new Deneme();
		
		deneme.NonStatic();// bu bir non static metod oldugu icin bir insntance olusturarak kullanmamiz gerekir
		
	}
	
	
}
