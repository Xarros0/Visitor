public class NormalState implements CharacterState {
    @Override
    public void accept(BonusVisitor visitor) {
        visitor.visit(this);
    }
}
