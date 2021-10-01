package demos.languagefeatures

object Emoji extends App {

  type `🎻` = String
  type `🦄` = Unit
  type `🔀`[`😅`,`😘`] = `😅` => `😘`

  val `✋`: `🎻` `🔀` `🦄` = println

  val `👹` = "Hello "
  val `🍺` = "JAX"

  `✋`(`👹` ⊕ `🍺`)

  implicit class `ᕕ( ᐛ )ᕗ`(`🎱`: `🎻`) {
    def ⊕(`🎸`: `🎻`): `🎻` = `🎱` + `🎸`
  }
}
