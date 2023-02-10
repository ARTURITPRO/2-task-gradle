package plugin;

public class DownloadPluginExtension {
    private String templateUrl = "https://pngimg.com/uploads/rabbit/rabbit_PNG3792.png";
    private String targetFile = "I://rabbit.png";

    public String getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    public String getTargetFile() {
        return targetFile;
    }

    public void setTargetFile(String targetFile) {
        this.targetFile = targetFile;
    }
}

