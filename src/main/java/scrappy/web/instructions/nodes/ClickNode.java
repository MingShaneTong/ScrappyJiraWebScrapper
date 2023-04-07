package scrappy.web.instructions.nodes;

import com.microsoft.playwright.Page;
import scrappy.web.instructions.Variables;
import scrappy.web.instructions.parameters.Selector;

public class ClickNode implements IInstructionNode {
    private final Selector selector;

    public ClickNode(Selector selector) {
        this.selector = selector;
    }

    @Override
    public void apply(Page page, Variables var) {
        page.click(selector.getSelector());
    }
}
