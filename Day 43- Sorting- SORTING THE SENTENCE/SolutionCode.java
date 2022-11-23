class Solution {
public String sortSentence(String s) {
String str[] = s.split(" ");
String res[] = new String[str.length];

    for(String x : str){
        int idx = (x.charAt(x.length()-1)-'0');
        res[idx-1] = x.substring(0, x.length()-1);
    }
    String st = "";
    for(int i=0; i<res.length-1; i++){
        st += res[i];
        st += " ";
    }
    st += res[res.length-1];
    return st;
}
}
