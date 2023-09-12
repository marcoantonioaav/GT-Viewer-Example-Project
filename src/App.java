import app.StartDesktopApp;
import manager.ai.AIRegistry;
import viewer.Viewer; 

public class App {
    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        AIRegistry.registerAI("Hybrid Minimax-MCTS", () -> {return new HybridMinimaxMCTS(viewer);}, (game) -> {return true;});
        StartDesktopApp.main(new String[0]);
        viewer.start();
    }
}