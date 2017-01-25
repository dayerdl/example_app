package uk.co.ribot.david.ui.main;

import java.util.List;

import uk.co.ribot.david.data.model.Ribot;
import uk.co.ribot.david.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
