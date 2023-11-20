import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Vector<Account> accounts = new Vector<Account>();

        for(int t=0; t< n; t++) {
            String accountName = sc.nextLine();
            Account account = new Account(accountName);
            accounts.add(account);
        }

        while(sc.hasNextLine) {
            String command = sc.nextLine();
            if(command.isEmpty()) {
                break;
            }

            
        }
        
    }
}

class Account {
    public String id;
    public String name;
    public Vector<Note> notes;

    public static nextId = 1;

    public Account(String name) {
        this.name = name;
        this.notes = new Vector<Note>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public void shareNote(String accountId, int noteId) {

    }
}

class Note {
    public int id;
    public String content;
    public Date dateCreated;

    public static int nextId = 1;

    public Note(String content, Date dateCreated) {
        this.id = nextId;
        nextId++;
        this.content = content;
        this.dateCreated = dateCreated;
    }


}