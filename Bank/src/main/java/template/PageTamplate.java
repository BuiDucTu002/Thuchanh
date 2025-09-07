package template;

public abstract class PageTamplate {
        protected void showHeader(){
            System.out.println("showHeader");
        };
        protected void showNavigation(){
            System.out.println("showNavigation");
        };
        protected void showFooter(){
            System.out.println("showFooter");
        };
        protected abstract void showBody();
        public final void showPage(){
            showHeader();
            showNavigation();
            showBody();
            showFooter();
        };
}
