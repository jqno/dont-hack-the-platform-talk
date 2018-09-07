package demos.languagefeatures

object Emoji extends App {

  type `🎻` = String
  type `🦄` = Unit
  type `🔀`[`😅`,`😘`] = `😅` => `😘`

  val `✋`: `🎻` `🔀` `🦄` = println

  val `👹` = "Hello "
  val `🍺` = "Oslo"

  `✋`(`👹` ⊕ `🍺`)

  implicit class `ᕕ( ᐛ )ᕗ`(`🎱`: `🎻`) {
    def ⊕(`🎸`: `🎻`): `🎻` = `🎱` + `🎸`
  }
}
