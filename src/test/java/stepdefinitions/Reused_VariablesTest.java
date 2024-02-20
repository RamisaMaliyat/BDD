package stepdefinitions;

import pages.Article_Page;
import pages.Download_File_Page;
import pages.Main_Page;
import pages.PageInformation_page;
import utils.SettingsTestData;

import java.io.File;

public class Reused_VariablesTest
{
    String name = "Albert Einstein";
    String expectedFileName = "Albert_Einstein.pdf";
    static Main_Page firstPage = new Main_Page();
    Article_Page secondPage = new Article_Page();

    Download_File_Page thirdPage = new Download_File_Page();

    PageInformation_page pageInformationPage = new PageInformation_page();

    public final String FILE_NAME = SettingsTestData.getFileData().getDownloadFile();
    public final String FILE_PATH = SettingsTestData.RESOURCE_FILE_PATH + FILE_NAME;
    protected final File downloadedFile = new File(FILE_PATH);


}
