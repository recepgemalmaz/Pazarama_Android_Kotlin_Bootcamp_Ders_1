class StokRepository {

    private var db: DBHelper? = null

    constructor(db: DBHelper) {
        this.db = db
    }

    fun GetRecorts() {
        this .db?.OpenConnection()
        this .db?.Run("SELECT * FROM Stok")
        this .db?.CloseConnection()

    }

}