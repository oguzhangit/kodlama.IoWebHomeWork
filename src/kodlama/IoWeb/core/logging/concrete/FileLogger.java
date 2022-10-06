package kodlama.IoWeb.core.logging.concrete;

import kodlama.IoWeb.core.logging.abstracts.logger.Logger;

public class FileLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println(data + "Dosyaya loglandı");
    }
}
