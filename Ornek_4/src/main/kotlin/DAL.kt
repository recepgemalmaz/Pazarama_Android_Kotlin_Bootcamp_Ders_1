abstract class DBHelper
{
    var ConnectionString: String = ""

    abstract fun OpenConnection()
    abstract fun CloseConnection()
    abstract fun Run(query: String)

}

final class SqlHelper: DBHelper()
{
    override fun OpenConnection() {
        println("Open SQL connection")
    }

    override fun CloseConnection() {
        println("Close SQL connection")
    }

    override fun Run(query: String) {
        println("Run T-SQL query: $query")
    }

}

final class OrecleHelper: DBHelper()
{
    override fun OpenConnection() {
        println("Open Oracle connection")
    }

    override fun CloseConnection() {
        println("Close Oracle connection")
    }

    override fun Run(query: String) {
        println("Run PL/SQL query: $query")
    }
}