trait Lambda {

  trait Exp[T]
  // Useful for embedding arbitrary things from parent language
  case class Const[T](t: T) extends Exp[T]
  // Abstraction
  case class App[S, T](fun: Exp[S => T], arg: Exp[S]) extends Exp[T]
  // Application
  case class Fun[S, T](body: Exp[S] => Exp[T]) extends Exp[S => T]
}
