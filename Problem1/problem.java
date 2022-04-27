public class problem {

  //  TC : O(n) SC : O(1)
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    NoOfCharacters(str);
  }

  public static void NoOfCharacters(String str) {
    str = str.toLowerCase();
    int[] freq = new int[26];

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == ' ') continue;
      freq[ch - 'a']++;
    }

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == ' ') continue;
      if (freq[ch - 'a'] > 0) {
        System.out.println(ch + "->" + freq[ch - 'a']);
        freq[ch - 'a'] = 0;
      }
    }
  }
}
