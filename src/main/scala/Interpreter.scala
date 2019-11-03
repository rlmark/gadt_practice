trait Interpreter extends Lambda {
  def eval[T](term: Exp[T]): T = {
    term match {
      case Const(t) => t
      case App(fun, arg) => eval(fun) apply eval(arg)
      case f: Fun[s,t] =>
        (x: s) =>  eval(f.body(Const(x)))
    }
  }
}
