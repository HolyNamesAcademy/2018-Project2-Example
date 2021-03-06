import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class WeatherForecastTests {
    @Test
    public void rainJacketNotRecommendedBelowThreshold() throws Exception {
        // Arrange
        ArrayList<SingleDayForecast> extendedForecast = new ArrayList<>();
        extendedForecast.add(new SingleDayForecast(50, 60, 10, "Sunny"));

        MultiDayForecast multiDayForecast = new MultiDayForecast(extendedForecast, 40);

        // Act
        boolean isJacketRecommended = multiDayForecast.rainJacketRecommended(0);

        // Assert
        assertFalse(isJacketRecommended);
    }

    @Test
    public void rainJacketRecommendedAboveThreshold() throws Exception {
        // Arrange
        // Act
        // Assert
    }

    @Test
    public void rainJacketRecommendedAtThreshold() throws Exception {
        // Arrange
        // Act
        // Assert
    }

    @Test
    public void containsSunnyDayNoSunnyDays() {
        // Arrange
        ArrayList<SingleDayForecast> extendedForecast = new ArrayList<>();
        extendedForecast.add(new SingleDayForecast(50, 60, 80, "Cloudy"));
        extendedForecast.add(new SingleDayForecast(55, 65, 80, "Partly Cloudy"));
        extendedForecast.add(new SingleDayForecast(50, 75, 80, "Smoky"));
        extendedForecast.add(new SingleDayForecast(53, 68, 80, "Cloudy"));

        MultiDayForecast multiDayForecast = new MultiDayForecast(extendedForecast, 0);

        // Act

        boolean containSunnyDay = multiDayForecast.containsSunnyDay();

        // Assert
        assertFalse(containSunnyDay);
    }


    @Test
    public void containsSunnyDayBeginningOfForecast() {
        // Arrange

        // Act

        // Assert

    }

    @Test
    public void containsSunnyDayEndOfForecast() {
        // Arrange
        // Act
        // Assert
    }
}