import java.util.*;
import java.util.stream.Collectors;
public class Present {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int f;

        for(int i = 1; i <= n; i++)
        {
            f = sc.nextInt();
            map.put(i, f);
        }

        Map<Integer, Integer> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
        (e1, e2) -> e1, LinkedHashMap::new));

        for(Map.Entry<Integer, Integer> en : sorted.entrySet())
        {
            System.out.print(en.getKey() + " ");
        }
    }
}
