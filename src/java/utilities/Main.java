/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author bajuna
 */
public class Main implements
        com.mmm.readers.modules.Swipe.DataHandler,
        com.mmm.readers.FullPage.EventHandler {

    public Main() {
       
    }

    public void OnSwipeReaderData(
            com.mmm.readers.modules.Swipe.SwipeItem aDataItem,
            com.mmm.readers.DataFormat aFormat,
            int aDataLen,
            byte aDataPtr[]
    ) {
// Process the data...
    }

    public void OnFullPageReaderEvent(com.mmm.readers.FullPage.EventCode aEventType) {
// Process the event...
    }

    public static void main(String[] args) {
        Main implObj = new Main();
        com.mmm.readers.modules.Swipe.Reader.Initialise(
                implObj, // aDataHandler
                implObj // aEventHandler
        );
        
// Continue...
    }
}
