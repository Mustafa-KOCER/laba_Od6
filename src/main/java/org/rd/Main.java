import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> kelimeler = new LinkedList<>();
        Collections.addAll(kelimeler,"kalem","elalem","kelime","kelam","ikilem");
        HashSet<Character> harf_listesi = new HashSet<>() ;
        int flag = 0;

        for(String kelime : kelimeler ) {
            for (int i = 0; i < kelime.length(); i++) {
                for (int j = i+1; j < kelime.length(); j++) {
                    if (kelime.charAt(j)== kelime.charAt(i)){
                        for (int harf = 0; harf < kelime.length(); harf++) {
                            harf_listesi.add(kelime.charAt(harf));
                        }
                        flag++;
                        i = kelime.length();// dışardaki döngüyü kırıp yeni kelimeye geçmek için
                        break;
                    }
                }
            }
            if (flag == 2) {
                break;
            }
        }

        ArrayList<Character> liste = new ArrayList<>(harf_listesi);
        Collections.shuffle(liste);

        Iterator itr = liste.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
