package assignment.Weight.Watchers;

public class Assignment1 {

	public void assignmment1(String textValue) {
		String reverse = "";
		for (int i = textValue.length() - 1; i >= 0; i--) {
			reverse = reverse + textValue.charAt(i);
		}
		System.out.println(reverse);
	}
}
