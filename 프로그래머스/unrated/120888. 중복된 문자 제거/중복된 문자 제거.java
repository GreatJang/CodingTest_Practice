import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] a = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            a[i] = String.valueOf(my_string.charAt(i));
        }
        Set<String> a2 = new LinkedHashSet<>(List.of(a));
        for (String s : a2) {
            sb.append(s);
        }
        return sb.toString();
        
    }
}

// // collection으로 해결해보기
// import java.util.*;
// class Solution {
//     public String solution(String my_string) {
//         List<String> list = new ArrayList<>();
//         for (int i = 0; i < my_string.length(); i++) {
//             list.add(String.valueOf(my_string.charAt(i)));
//         }
//         // if(list.size() == 1){
//         // String answer = String.join("", list);
//         // return answer;
//         // }
//         for (int i = 0; i < list.size(); i++) {
//             for (int j = i + 1; j < list.size(); j++) {
//                 if (list.get(i).equals(list.get(j))) {
//                     list.remove(j);
//                 }
//             }
//         }
//         String answer = String.join("", list);
//         return answer;
//     }
// }