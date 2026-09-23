package String;
public class countLenghWithoutLenth {
    static void countlenth(String str){
      char count[] = str.toCharArray();
      int len = count.length;

//      int count = 0
//      for(char ch : str.toCharArray()){
//          count++;
//      }

        System.out.println(len);
    }
    public static void main(String[] args){
        String str = "umeshgayakwad";
        countlenth(str);
    }
}
