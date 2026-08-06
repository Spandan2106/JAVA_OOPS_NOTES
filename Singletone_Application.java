// The Database class defines the getInstance method that lets
// clients access the same instance of a database connection.
class Database {
    // The field storing the singleton instance must be static and volatile
    // to ensure thread safety during double-checked locking.
    private static volatile Database instance;

    // Private constructor prevents direct instantiation.
    private Database() {
        // Initialization code (e.g., database connection)
    }

    // Static method controlling access to the singleton instance.
    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                // Double-check to ensure no other thread initialized it
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }

    // Business logic method.
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}

public class Singletone_Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM users");

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM products");

        // Verification that both variables point to the same instance
        System.out.println("foo and bar are same instance: " + (foo == bar));
    }
}