public class Oopsbanner1 {
	public static void main(String[] args){
		String[] Lines = new String[7];
		Lines[0]=String.join(" ", " ***** ", " ***** ", "*****  ", " **** ");
		Lines[1]=String.join(" ", "**   **", "**   **", "**   **", "**    ");
		Lines[2]=String.join(" ", "**   **", "**   **", "**   **", "**    ");
		Lines[3]=String.join(" ", "**   **", "**   **", "*****  ", " **** ");
		Lines[4]=String.join(" ", "**   **", "**   **", "**     ", "    **");
		Lines[5]=String.join(" ", "**   **", "**   **", "**     ", "    **");
		Lines[6]=String.join(" ", " ***** ", " ***** ", "**     ", " **** ");
		
		for(String line : Lines){
			System.out.println(line);
		}
	}
}