import java.util.Scanner;

public class Baza {
    Scanner scan = new Scanner(System.in);
    public int lelem; // aktualna liczba elementow tablicy kol-vo
    public int koniec; // indeks ostatniego elementu index
    public int tabSize;

    Osoba[] osobaTab;
    public Baza(int size) { // Konstruktor
        System.out.println("Konstruktor baza, size: " + size);
        tabSize = size;
        osobaTab = new Osoba[size];
        lelem = osobaTab.length;
        koniec = lelem - 1;

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

    public void dodaj(Osoba osoba)
    {
        // Dodaj now?? osob?? do bazy
        // Uzupe??ni??
        // ?????????????????? ???????????? ???????????????? ?? ????????
        // ????????????????????

        //System.out.println("???????????????????? ???????????? ??????????????????????????");
        System.out.println("Poka?? nowy adres");
        for (int i = 0; i < tabSize; i++) {
            if (osobaTab[i].dajPesel() == -1)
            {
                osobaTab[i].wczytaj(osoba.dajImie(), osoba.dajNazwisko(), osoba.dajPesel());
                sort();
                return;
            }
        }

        //System.out.printf("?? ???????? ?????? ???????????????????? ??????????");
        System.out.printf("Brak wolnego miejsca w bazie danych");
    }    

    public void dodaj(Student student)
    {
        // Dodaj now?? osob?? do bazy
        // Uzupe??ni??
        // ?????????????????? ???????????? ???????????????? ?? ????????
        // ????????????????????

        //System.out.println("???????????????????? ???????????? ??????????????????????????");
        System.out.println("Poka?? nowy adres");
        for (int i = 0; i < tabSize; i++) {
            if (osobaTab[i].dajPesel() == -1)
            {
                osobaTab[i].wczytaj(student.dajImie(), student.dajNazwisko(), student.dajPesel());
                sort();
                return;
            }
        }

        //System.out.printf("?? ???????? ?????? ???????????????????? ??????????");
        System.out.printf("Brak wolnego miejsca w bazie danych");
    } 

    public void dodaj(Pracownik pracownic)
    {
        // Dodaj now?? osob?? do bazy
        // Uzupe??ni??
        // ?????????????????? ???????????? ???????????????? ?? ????????
        // ????????????????????

        //System.out.println("???????????????????? ???????????? ??????????????????????????");
        System.out.println("Poka?? nowy adres");
        for (int i = 0; i < tabSize; i++) {
            if (osobaTab[i].dajPesel() == -1)
            {
                osobaTab[i].wczytaj(pracownic.dajImie(), pracownic.dajNazwisko(), pracownic.dajPesel());
                sort();
                return;
            }
        }

        //System.out.printf("?? ???????? ?????? ???????????????????? ??????????");
        System.out.printf("Brak wolnego miejsca w bazie danych");
    }

    public void dodaj() {
        // Dodaj now?? osob?? do bazy
        // Uzupe??ni??
        // ?????????????????? ???????????? ???????????????? ?? ????????
        // ????????????????????

        //System.out.println("???????????????????? ???????????? ??????????????????????????");
        System.out.println("\nPoka?? nowy adres");
        for (int i = 0; i < tabSize; i++) {
            if (osobaTab[i].dajPesel() == -1)
            {
                boolean sqlInjectSymol = false;
                //Name
                String imie;
                while (true) {
                    try {
                        System.out.print("Imie: ");
                        imie = scan.nextLine();
                        //check name
                        sqlInjectSymol = checkForbiddenSqlSymbols(imie);
                        if (sqlInjectSymol == true)
                        {
                            //System.out.println("You use frobidden symbols, try again");
                            System.out.println("U??y??e?? niedozwolonych symboli, spr??buj ponownie");
                            continue;
                        }
                        else
                        {
                            sqlInjectSymol = false;
                            break;
                        }
                    } catch (Exception e) {
                        //System.out.println("Wrong input");
                        System.out.println("Niew??a??ciwe dane wej??ciowe");
                    }
                }
                //Last name
                String nazwisko;
                while (true) {
                    try {
                        System.out.print("Nazwisko: ");
                        nazwisko = scan.nextLine();
                        // check nazwisko
                        sqlInjectSymol = checkForbiddenSqlSymbols(imie);
                        if (sqlInjectSymol == true)
                        {
                            //System.out.println("You use forbidden symbols, try again");
                            System.out.println("U??y??e?? niedozwolonych symboli, spr??buj ponownie");
                            continue;
                        }
                        else
                        {
                            sqlInjectSymol = false;
                            break;
                        }
                    } catch (Exception e) {
                        //System.out.println("Wrong input");
                        System.out.println("Niew??a??ciwe dane wej??ciowe");
                    }
                }
                //Pesel
                long pesel;
                while (true) {
                    try {
                        System.out.print("Pesel (number): ");
                        pesel = scan.nextLong();    
                        try
                        {
                            scan.nextLine();
                        }
                        catch (Exception e)
                        {
                            //System.out.println("Wrong input, try again");
                            System.out.println("B????dne dane, spr??buj ponownie");
                            continue;
                        }
                        //check pesel len and value
                        if (pesel <= 0)
                        {
                            System.out.println("Pesel jest mniejsze od zera, wpisz nowe pesel");
                            continue;
                        }
                        //System.out.println("lenw pesel = " + getCountOfNums(pesel));
                        // check pesel exist
                        boolean pesel_exist = false;
                        for (var osoba: osobaTab)
                        {
                            if (osoba.dajPesel() == pesel)
                            {
                                pesel_exist = true;
                                System.out.println("To pesel ju?? istnieje, wpisz nowypesel");
                            }
                        }
                        if (pesel_exist == true)
                        {
                            continue;
                        }
                        else{
                            break;  
                        }
                            
                    } catch (Exception e) {
                        System.out.println("Wrong input");
                        System.out.println("Niew??a??ciwe dane wej??ciowe");
                    }
                }

                osobaTab[i].wczytaj(imie, nazwisko, pesel);
                sort();
                return;
            }
        }

        //System.out.printf("?? ???????? ?????? ???????????????????? ??????????");
        System.out.printf("Brak wolnego miejsca w bazie danych");
    }
    public int szukaj(long pesel) {
        // Szukaj osoby o peselu pesel
        // Uzupe??ni??
        // ?????????? ???????????????? ?? pesel pesel
        // ????????????????????
        for (int i = 0; i < tabSize; i++) {
            if (osobaTab[i].dajPesel() == pesel) {
                //System.out.println("?????????? ????????????????, ?????????? ????????????");
                System.out.println("Osoba znaleziona, dane wyj??ciowe");
                System.out.printf("Imie: %s\nNazwisko: %s\nPesel: %d\n", osobaTab[i].dajImie(), osobaTab[i].dajNazwisko(), osobaTab[i].dajPesel());
                return i;
            }
        }
        return -1;
    }
    public void lista () {
        // Drukuj liste osob ----------------
        // Uzupe??ni??
        // ?????????????????????? ???????????? ?????????? ----------------
        // ????????????????????
        int null_counter = 0;
        int persona_counter = 0;
        for (int i = 0; i < tabSize; i++) {

            if (osobaTab[i].dajPesel() != -1) {
                //System.out.printf("\n?????????? ???%d\n", (i+1));
                System.out.printf("\nOsoba ???%d\n", (++persona_counter));
                System.out.printf("Imie: %s\nNazwisko: %s\nPesel: %d\n", osobaTab[i].dajImie(), osobaTab[i].dajNazwisko(), osobaTab[i].dajPesel());
            }
            else {
                null_counter++;
            }
        }
        if (null_counter == tabSize) {
            //System.out.println("?????? ??????????????????????????, ???????? ???????????? ??????????");
            System.out.println("Brak u??ytkownik??w, baza danych jest pusta");
        }
    }
    public void usun(int pesel) {
        // Usuwamy osobe o peselu pesel
        // ?????????????? ???????????????? ?? pesel pesel
        for (int i = 0; i < tabSize; i++) {
            if (osobaTab[i].dajPesel() == pesel) {
                osobaTab[i].wczytaj("null", "null", -1);
                //System.out.println("?????????? ?????????????? ??????????????");
                System.out.println("Osoba usuni??ta pomy??lnie");
            }
        }
    }

    public void sort() {
        int len = osobaTab.length;
        for (int i=0;i<len-1;++i){
            for(int j=0;j<len-i-1; ++j){
                if(osobaTab[j+1].dajPesel() < osobaTab[j].dajPesel()){
                    Osoba swap = osobaTab[j];
                    osobaTab[j] = osobaTab[j+1];
                    osobaTab[j+1] = swap;
                }
            }
        }
    }
}