



fun main() {
    var helperSql: DBHelper = SqlHelper()
    var rep = StokRepository(helperSql)
    rep.GetRecorts()

    var helperOracle: DBHelper = OrecleHelper()
    var repOrecle = StokRepository(helperOracle)
    repOrecle.GetRecorts()


}