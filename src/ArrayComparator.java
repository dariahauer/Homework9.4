//import java.util.Comparator;

public class ArrayComparator {
    static boolean compare( int table1[], int table2[]){

        if (table1==table2){
            return true;
        }else
            return false;

    }

//    import java.util.Comparator;
//
//    public class Komparator implements Comparator<Pracownik>
//    {
//
//        @Override
//        public int compare(Pracownik p1, Pracownik p2) {
//            if(p2 == null) return -1;
//            if(p1.getWyplata() > p2.getWyplata()) return 1;
//            else if(p1.getWyplata() < p2.getWyplata()) return -1;
//            else return 0;
//        }
//    }


//    Stwórz program składający się z dwóch klas:
//
//    ArrayComparator – klasa posiadająca tylko jedną metodę compare(), która jako parametery przyjmuje dwie tablice
//    (typu prostego wybranego przez Ciebie) i zwraca wartość true jeśli tablice te są identyczne lub false jeśli się różnią.
//    Do implementacji metody compare wykorzystaj wyłącznie pętle i instrukcje sterujące.
//
//    ArrayTest – utwórz w niej dwie tablice i przetestuj działanie zdefiniowanej metody compare()
//
//    Następnie w klasie ArrayComparator dodaj przeciążoną metodę compare, która porównuje tablice dwuwymiarowe i przetestuj jej działanie w drugiej klasie.
//
//    Metody porównujące tablice powinny mieć zabezpieczenia przed przekazywaniem pustych tablic lub wartości null.
}
