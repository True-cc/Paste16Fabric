package uwu.smsgamer.paste16fabric.gui.clickgui.valueEditors;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec2f;
import uwu.smsgamer.paste16fabric.gui.clickgui.AbstractClickGui;
import uwu.smsgamer.paste16fabric.values.*;

public class ToggleEditor extends AbstractValueEditor<Boolean> {
    public ToggleEditor(Val<Boolean> thisVal) {
        super(thisVal);
    }

    @Override
    protected Vec2f render(MatrixStack stack, AbstractClickGui gui, float x, float y, double mouseX, double mouseY) {
        fill(stack, (int) x, (int) y, (int) (x + width), (int) (y + width), 0xFF666666);
        if (val.getValue()) {
            fill(stack, (int) x + 1, (int) y + 1, (int) (x + width - 1), (int) (y + width - 1), 0xFF00FF00);
        } else {
            fill(stack, (int) x + 1, (int) y + 1, (int) (x + width - 1), (int) (y + width - 1), 0xFFFF0000);
        }
        return new Vec2f(20, 20);
    }

    @Override
    public Vec2f getSize(AbstractClickGui gui, float w, float h) {
        return new Vec2f(10, 10);
    }
}
