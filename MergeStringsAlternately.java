class MergeStringsAlternately{
  public static void mergestr(String word1,String word2){
    StringBuilder sb= new StringBuilder();
    int i=0,j=0;
    while(i<word1.length() && j<word2.length()){
      sb.append(word1.charAt(i));
      sb.append(word2.charAt(j));
      i++;
      j++;

    }
    while(i<word1.length()){
      sb.append(word1.charAt(i));
      i++;
    }
    while(j<word2.length()){
      sb.append(word2.charAt(j));
      j++;
    }
    System.out.println(sb);
  }
    public static void main(String[] args) {
   String word1= "ab";
   String word2="pqrs";
   mergestr(word1,word2);
      }
    }