package ask.urfu.misc.patterns.library.character;

public interface CharacterClass {

  String name();

  String description();

  CharacterModel initialModel();

  void levelUp(GameCharacter c);

}
