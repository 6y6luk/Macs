import java.util.Scanner;

public class Baza {
    Scanner scan = new Scanner(System.in);
    public int tabSize; // aktualna liczba elementow tablicy kol-vo
    public int lastIndex; // indeks ostatniego elementu index
    

    Osoba[] osobaTab;

    public Baza(int size) { // Konstruktor
        System.out.println("Konstruktor baza, size: " + size);
        tabSize = size;
        osobaTab = new Osoba[size];
        tabSize = osobaTab.length;
        lastIndex = tabSize - 1;

        for (int i = 0; i < tabSize; i++) {
            osobaTab[i] = new Osoba();
        }
    }

    private byte getCountOfNums(byte num)
    {
        byte count = 0;
        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }
        return count;
    }

    private short getCountOfNums(short num)
    {
        short count = 0;
        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }
        return count;
    }

    private int getCountOfNums(int num)
    {
        int count = 0;
        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }
        return count;
    }

    private long getCountOfNums(long num)
    {
        long count = 0;
        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }
        return count;
    }

    private long getCountOfNums(String str)
    {
        return (str.length());
    }

    private boolean checkForbiddenSqlSymbols(String str)
    {
        char forbiddenSymbols[] = {'\0', '\'', '\'', '\b', '\n', '\r', '\t', '\\', '%', '_', '<', '>', '=', '-', '+', '!', '@', '#', '$', '^', '&', '*', '(', ')', '?', '{', '}', '[', ']', '/' };
        var char_strArray = str.toCharArray();
        for (int i = 0; i < char_strArray.length; i++)
        {
            for (var symbol: forbiddenSymbols)
            {
                if (symbol == char_strArray[i])
                {
                    return true;
                }
            }
        }
        return false;
    }
  

    public void Add(Osoba osoba) {
        int free_index = -1;
        int busy_counter = 0;
        long pesel_buffer = osoba.getPesel();
        for (int i = 0; i < tabSize; i++) 
        {
            if (osobaTab[i].getPesel() == pesel_buffer)
            {
                System.out.println("This pesel already exist");
                return;
            }
            if (osobaTab[i].getPesel() != -1) 
            {
                busy_counter++;
            }
            else
            {
                free_index = i;
            }
        }
        if (free_index == -1 || busy_counter == tabSize)
        {
            System.out.println("No free paces in data base");
            return;
        }
        osobaTab[free_index] = osoba;
        sort();
    }

    public int Find(long pesel) {
        // Szukaj osoby o peselu pesel
        // Uzupełnić
        // Поиск человека с pesel pesel
        // Пополнение
        for (int i = 0; i < tabSize; i++) {
            if (osobaTab[i].getPesel() == pesel) {
                //System.out.println("Особа найденна, вывод данных");
                System.out.println("Osoba znaleziona, dane wyjściowe");
                System.out.printf("Imie: %s\nNazwisko: %s\nPesel: %d\n\n", osobaTab[i].getName(), osobaTab[i].getLastName(), osobaTab[i].getPesel());
                return i;
            }
        }
        return -1;
    }

    public void Print() {
        for (int i = 0; i < tabSize; i++) {
            //System.out.println(osobaTab[0].getPesel());
            if (osobaTab[i].getPesel() != -1) {
                System.out.printf("Imie: %s\nNazwisko: %s\nPesel: %d\n\n", osobaTab[i].getName(), osobaTab[i].getLastName(), osobaTab[i].getPesel());
            }
        }
    }

    public void Delete(int pesel) {
        for (int i = 0; i < tabSize; i++) {
            if (osobaTab[i].getPesel() == pesel) {
                osobaTab[i].Delete();
            }
        }
    }

    public void sort() {
        int len = osobaTab.length;
        for (int i=0;i<len-1;++i){
            for(int j=0;j<len-i-1; ++j){
                if(osobaTab[j+1].getPesel() < osobaTab[j].getPesel()){
                    Osoba swap = osobaTab[j];
                    osobaTab[j] = osobaTab[j+1];
                    osobaTab[j+1] = swap;
                }
            }
        }
    }
}