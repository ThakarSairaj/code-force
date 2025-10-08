import java.util.*;

public class AAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s;
        int result = 0;

/*Tetrahedron. Tetrahedron has 4 triangular faces.
Cube. Cube has 6 square faces.
Octahedron. Octahedron has 8 triangular faces.
Dodecahedron. Dodecahedron has 12 pentagonal faces.
Icosahedron. Icosahedron has 20 triangular faces. */

        for(int i = 0; i < n; i++)
        {
            s = sc.next();
            
            switch(s) {
                case "Tetrahedron" -> result += 4;
                case "Cube" -> result += 6;
                case "Octahedron" -> result += 8;
                case "Dodecahedron" -> result += 12;
                case "Icosahedron" -> result += 20;  
            }
        }

        System.out.println(result);

        
    }
}
