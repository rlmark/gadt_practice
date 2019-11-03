trait LamExamples extends Lambda {
  val term1 = App(Fun((x: Exp[Int]) => x), Const(1)) // Apply the function x => x to constant 1

  /* can't do poorly typed things
    val nonCompiling = Fun((x: Exp[Int]) => App(x, Const(1)))
    fails to compile because App expects as its first argument a Exp function from A => B not a Exp[Int]
   */
}
