import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {
    @Bean
    fun trainContainer(): TrainContainer {
        return TrainContainer()
    }
}