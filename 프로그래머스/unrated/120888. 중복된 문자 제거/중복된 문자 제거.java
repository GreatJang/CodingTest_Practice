import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] a = my_string.split("");
        String[] b = Arrays.stream(a).distinct().toArray(String[]::new);
        String answer = String.join("",b);
        return answer;
    }
}

// import java.util.*;
// class Solution {
//     public String solution(String my_string) {
//         String[] a = my_string.split("");
//         Set<String> a2 = new LinkedHashSet<>(Arrays.asList(a));
//         return String.join("",a2);
//     }
// }

// import java.util.*;
// class Solution {
//     public String solution(String my_string) {
//         List<String> list = new ArrayList<>();
//         for (int i = 0; i < my_string.length(); i++) {
//             list.add(String.valueOf(my_string.charAt(i)));
//         }
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