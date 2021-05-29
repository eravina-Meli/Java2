package Ejercicio6;

public class StringUtils
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n)
	{
		String res ="";
		for (int i =0; i<n; i++){
			res = res + c;
		}
		return res;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		String cadena = "";
		int cantidadC = Character.getNumericValue(c);
		for (int i = 1; i <= n; i++){
			cadena +=cantidadC;
		}
		cadena +=s;
		return cadena;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String[] arrayStrings = new String[arr.length];
		for (int i =0; i < arr.length; i++){
			arrayStrings[i] = Integer.toString(arr[i]);
		}

		return arrayStrings;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] arrayInt = new int[arr.length];
		for (int i =0; i < arr.length; i++){
			arrayInt[i] = Integer.parseInt(arr[i]);
		}

		return arrayInt;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int maximo=0;
		for (int i =0; i < arr.length; i++){
			if(arr[i].length() > maximo)
				maximo = arr[i].length();
		}

		return maximo;
	}

	/*public static void main(String[] args) {
		String[] arg = {"ferreira","pedrobustamante","fndacurti"};
		int l = maxLength(arg);
		System.out.println(l);
	}*/

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int longitud = maxLength(arr);//12
		int max = 0;
		int longitudTotal =0;
		for (int i=0; i < arr.length; i++){
			if(arr[i].length() < longitud){
				max = arr[i].length();
				longitudTotal = longitud - max;
				if(longitud > max)
					arr[i] = lpad((arr[i].toString()), longitudTotal, c);
			}
	}
	}

	public static String rpad(String s, char c, int n){
		//Igual que lPad pero agregando caracteres a la derecha
		String cadena = "";
		//int cantidadC = Character.getNumericValue(c);
		for (int i = 1; i <= n; i++) {
			cadena += Character.toString(c);
		}
		s += cadena;
		return s;
	}

	/*public static void main(String[] args) {
		String rpad = rpad("rpad",'0',5);
		String lpad = lpad("lpad",5,'0');
		System.out.println(rpad);
		System.out.println(lpad);
	}*/


	public static String ltrim(String s){
		//Retorna una cadena identica a s, pero sin espacios a la izquierda
		String cadena ="";
		char space = ' ';
		int indexUltimoChars =0;

		for (int i=0; i<s.length(); i++){
			if(s.charAt(i) != space && indexUltimoChars < i) {
				indexUltimoChars = i;
				cadena += s.charAt(i);
			}
			cadena += s.replace(" ", "");
		}
		return cadena;
	}

	public static void main(String[] args) {
		//String espaciosIzq1 = "ferreira";
		String espaciosIzq2 = "     ferreira      a";
		String retur= ltrim(espaciosIzq2);
		System.out.println(retur);
		//System.out.println(espaciosIzq2);
	}

	public static String rtrim(String s){
		//Retorna una cadena identica a s, pero sin espacios a la derecha.
		String cadena = s.replace(" ","");
		return cadena;
	}
	public static String trim(String s){
		//Retorna igual que lpad, pero sin espacios a la derecha ni izquierda
		return "";
	}

	public static int indexOfN(String s, char c, int n){
		//retorna la posicion de la n-esima ocurrencia del carater c, dentro de s, o -1 si
		//s no contiene a c. Por ejemplo, si s="John|Paul|George|Ringo", c="|", y n=2, la funcion
		//debe retornar la posicion de la segunda ocurrencia del caracter pipe dentro de la cadena s, en este caso es 9
		return 0;
	}
}
