package lesson3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * <p>
 * This lesson is all about GUI. There's three (reasonably) ways you can create a GUI in java:
 * <ol>
 * 		<li>AWT (Abstract Window Toolkit)</li>
 * 		<li>Swing</li>
 * 		<li>JavaFX</li>
 * </ol>
 * JavaFX is the most recent, has the best performance, a clear separation between the model, view, and controller, and
 * several other features making it the one used in this lesson.
 * 
 * <p>
 * Everything you need for JavaFX will be contained in some <code>javafx.*</code> package. Ignore any <code>com.sun.*</code>
 * packages as they are deprecated.
 * 
 * <p>
 * Here is a nice illustration of all the types of 'panes' that can be used for layout in JavaFX. These can be found under the
 * <code>javafx.layout</code> package.<br>
 * <img src="{@docRoot}/doc-files/JavaFXPanes.png" alt="JavaFX Panes Layed Out Visually">
 * 
 * @author Rawad
 *
 */
public class Lesson3 {
	
	public static void main(String[] args) {
		
		/* Leaving out the first argument, JavaFXApp.class, would make JavaFX think the class calling it (Lesson3 in this
		 * case) is the Application class (class that extends application) which it isn't in this class (Lesson3 does NOT 
		 * extend Application) so we have to specify JavaFXApp.class.
		 */
		Application.launch(JavaFXApp.class, args);
		
	}
	
	public static class JavaFXApp extends Application {
		
		public JavaFXApp() {}
		
		@Override
		public void start(Stage primaryStage) throws Exception {
			
			StackPane root = new StackPane();
			/* Set the preferred size (width and height) of the root. The size of the root will change as the Stage is
			 * resizeed.
			 */
			root.setPrefSize(200, 200);
			root.setBackground(// Set the background to the one given below.
					new Background(// Make a new background to set as this root's background.
							new BackgroundFill(// Tell the Background how to fill itself.
									Color.AQUA,// Fill with the color Aqua.
									CornerRadii.EMPTY,// Don't care for curvy rectangles.
									Insets.EMPTY)// No need to inset the fill, just fill the whole StackPane.
							)
					);
			
			/* At the heart of any Stage there is a Scene defining what is displayed inside the Stage. You can have multiple
			 * of these scenes and switch between them while the program is running.
			 */
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);// Actually set the scene of the Stage.
			primaryStage.setTitle("This Stage Is Great!");// Set the title of the Stage.
			
			/* Resize the Stage so it perfectly matches the size of the scene. This will make use of the preferred size we
			 * set for the root earlier so the Stage will be the same size as the root.
			 */
			primaryStage.sizeToScene();
			
			// NEVER FORGET TO SHOW THE STAGE. It is hidden by default so you can do all the initialization we just did.
			primaryStage.show();
			
		}
		
	}
	
}
