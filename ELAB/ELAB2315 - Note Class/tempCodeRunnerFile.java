import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Note {
    private String content;
    private int id;
    private String date;
    private static int nextId = 1;

    public Note(String date, String content) {
        this.id = nextId++;
        this.date = date;
        this.content = content;
    }

    public String toString() {
        return String.format("%02d %s | %s", id, date, content);
    }
}

class Account {
    private String id;
    private String name;
    private ArrayList<Note> notes;

    public Account(String name) {
        this.id = String.format("%03d", nextId++);
        this.name = name;
        this.notes = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void addNote(String date, String content) {
        Note note = new Note(date, content);
        notes.add(note);
    }

    public void shareNoteWith(Account otherAccount, int noteId) {
        if (noteId > 0 && noteId <= notes.size()) {
            Note sharedNote = notes.get(noteId - 1);
            otherAccount.notes.add(sharedNote);
        }
    }

    public void printNotes() {
        System.out.println("Account: " + name);
        for (Note note : notes) {
            System.out.println(note.toString());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAccounts = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        HashMap<String, Account> accountMap = new HashMap<>();

        for (int i = 0; i < numAccounts; i++) {
            String accountName = scanner.nextLine();
            Account account = new Account(accountName);
            accountMap.put(account.getId(), account);
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.isEmpty()) {
                break;  // Kết thúc nhập liệu nếu dòng tiếp theo không nhập gì
            }

            Scanner lineScanner = new Scanner(line);
            String accountId = lineScanner.next();

            if (accountMap.containsKey(accountId)) {
                Account currentAccount = accountMap.get(accountId);

                String action = lineScanner.next();

                if (action.equals("Add")) {
                    String date = lineScanner.next();
                    String content = lineScanner.nextLine().trim();
                    currentAccount.addNote(date, content);
                } else if (action.equals("Share")) {
                    String targetAccountId = lineScanner.next();
                    int noteId = lineScanner.nextInt();
                    Account targetAccount = accountMap.get(targetAccountId);
                    currentAccount.shareNoteWith(targetAccount, noteId);
                } else {
                    System.out.println("invalid input");
                    return;
                }
            } else {
                System.out.println("invalid input");
                return;
            }
        }

        for (Account account : accountMap.values()) {
            account.printNotes();
        }
    }
}
