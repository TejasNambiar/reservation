package com.casestudy.reservation.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.casestudy.reservation.dto.AdminDto;
import com.casestudy.reservation.dto.ScheduleDto;
import com.casestudy.reservation.dto.StationsDto;
import com.casestudy.reservation.dto.TrainDto;
import com.casestudy.reservation.entity.Admin;
import com.casestudy.reservation.entity.Schedule;
import com.casestudy.reservation.entity.Stations;
import com.casestudy.reservation.entity.Train;

import java.util.HashMap;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DtoPojoConverterTest {
    /**
     * Method under test: {@link DtoPojoConverter#conversionCheckPoint(Object)}
     */
    @Test
    void testConversionCheckPoint() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by conversionCheckPoint(Object)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by conversionCheckPoint(Object)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new DtoPojoConverter<>()).conversionCheckPoint("Object");
    }

    /**
     * Method under test: {@link DtoPojoConverter#conversionCheckPoint(Object)}
     */
    @Test
    void testConversionCheckPoint2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by conversionCheckPoint(Object)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        assertNull(
                ((Stations) dtoPojoConverter.conversionCheckPoint(new StationsDto("Station Name", "Station Code"))).getId());
        assertEquals("STATION NAME",
                ((Stations) dtoPojoConverter.conversionCheckPoint(new StationsDto("Station Name", "Station Code")))
                        .getStationName());
        assertEquals("STATION CODE",
                ((Stations) dtoPojoConverter.conversionCheckPoint(new StationsDto("Station Name", "Station Code")))
                        .getStationCode());
    }

    /**
     * Method under test: {@link DtoPojoConverter#conversionCheckPoint(Object)}
     */
    @Test
    void testConversionCheckPoint3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by conversionCheckPoint(Object)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        assertEquals("Arrival", ((Schedule) dtoPojoConverter.conversionCheckPoint(
                new ScheduleDto("Train Name", "42", "Station Name", "Station Code", "Arrival", "Departure"))).getArrival());
        assertEquals("42",
                ((Schedule) dtoPojoConverter.conversionCheckPoint(
                        new ScheduleDto("Train Name", "42", "Station Name", "Station Code", "Arrival", "Departure")))
                        .getTrainNumber());
        assertEquals("TRAIN NAME",
                ((Schedule) dtoPojoConverter.conversionCheckPoint(
                        new ScheduleDto("Train Name", "42", "Station Name", "Station Code", "Arrival", "Departure")))
                        .getTrainName());
        assertEquals("STATION NAME",
                ((Schedule) dtoPojoConverter.conversionCheckPoint(
                        new ScheduleDto("Train Name", "42", "Station Name", "Station Code", "Arrival", "Departure")))
                        .getStationName());
        assertEquals("STATION CODE",
                ((Schedule) dtoPojoConverter.conversionCheckPoint(
                        new ScheduleDto("Train Name", "42", "Station Name", "Station Code", "Arrival", "Departure")))
                        .getStationCode());
        assertNull(((Schedule) dtoPojoConverter.conversionCheckPoint(
                new ScheduleDto("Train Name", "42", "Station Name", "Station Code", "Arrival", "Departure"))).getId());
        assertEquals("Departure",
                ((Schedule) dtoPojoConverter.conversionCheckPoint(
                        new ScheduleDto("Train Name", "42", "Station Name", "Station Code", "Arrival", "Departure")))
                        .getDeparture());
    }

    /**
     * Method under test: {@link DtoPojoConverter#conversionCheckPoint(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConversionCheckPoint4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by conversionCheckPoint(Object)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.trainPojoConversion(DtoPojoConverter.java:58)
        //       at com.casestudy.reservation.util.DtoPojoConverter.conversionCheckPoint(DtoPojoConverter.java:31)
        //   In order to prevent conversionCheckPoint(Object)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   conversionCheckPoint(Object).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        dtoPojoConverter.conversionCheckPoint(new TrainDto());
    }

    /**
     * Method under test: {@link DtoPojoConverter#conversionCheckPoint(Object)}
     */
    @Test
    void testConversionCheckPoint5() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by conversionCheckPoint(Object)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        assertNull(((Admin) dtoPojoConverter.conversionCheckPoint(new AdminDto("Jane", "Doe", "Admin Name", "iloveyou")))
                .getAdminId());
        assertEquals("iloveyou",
                ((Admin) dtoPojoConverter.conversionCheckPoint(new AdminDto("Jane", "Doe", "Admin Name", "iloveyou")))
                        .getPassword());
        assertNull(((Admin) dtoPojoConverter.conversionCheckPoint(new AdminDto("Jane", "Doe", "Admin Name", "iloveyou")))
                .getLoginTime());
        assertNull(((Admin) dtoPojoConverter.conversionCheckPoint(new AdminDto("Jane", "Doe", "Admin Name", "iloveyou")))
                .getLogOutTime());
        assertEquals("DOE",
                ((Admin) dtoPojoConverter.conversionCheckPoint(new AdminDto("Jane", "Doe", "Admin Name", "iloveyou")))
                        .getLastName());
        assertEquals("JANE",
                ((Admin) dtoPojoConverter.conversionCheckPoint(new AdminDto("Jane", "Doe", "Admin Name", "iloveyou")))
                        .getFirstName());
        assertNull(((Admin) dtoPojoConverter.conversionCheckPoint(new AdminDto("Jane", "Doe", "Admin Name", "iloveyou")))
                .getCreatedDate());
        assertEquals("ADMIN NAME",
                ((Admin) dtoPojoConverter.conversionCheckPoint(new AdminDto("Jane", "Doe", "Admin Name", "iloveyou")))
                        .getAdminName());
    }

    /**
     * Method under test: {@link DtoPojoConverter#adminPojoConversion(AdminDto)}
     */
    @Test
    void testAdminPojoConversion() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.adminPojoConversion(DtoPojoConverter.java:48)
        //   In order to prevent adminPojoConversion(AdminDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   adminPojoConversion(AdminDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        Admin actualAdminPojoConversionResult = dtoPojoConverter
                .adminPojoConversion(new AdminDto("Jane", "Doe", "Admin Name", "iloveyou"));
        assertNull(actualAdminPojoConversionResult.getAdminId());
        assertEquals("iloveyou", actualAdminPojoConversionResult.getPassword());
        assertNull(actualAdminPojoConversionResult.getLoginTime());
        assertNull(actualAdminPojoConversionResult.getLogOutTime());
        assertEquals("DOE", actualAdminPojoConversionResult.getLastName());
        assertEquals("JANE", actualAdminPojoConversionResult.getFirstName());
        assertNull(actualAdminPojoConversionResult.getCreatedDate());
        assertEquals("ADMIN NAME", actualAdminPojoConversionResult.getAdminName());
    }

    /**
     * Method under test: {@link DtoPojoConverter#adminPojoConversion(AdminDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAdminPojoConversion2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.adminPojoConversion(DtoPojoConverter.java:48)
        //   In order to prevent adminPojoConversion(AdminDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   adminPojoConversion(AdminDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.adminPojoConversion(DtoPojoConverter.java:48)
        //   In order to prevent adminPojoConversion(AdminDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   adminPojoConversion(AdminDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        dtoPojoConverter.adminPojoConversion(new AdminDto());
    }

    /**
     * Method under test: {@link DtoPojoConverter#adminPojoConversion(AdminDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAdminPojoConversion3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.adminPojoConversion(DtoPojoConverter.java:48)
        //   In order to prevent adminPojoConversion(AdminDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   adminPojoConversion(AdminDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.adminPojoConversion(DtoPojoConverter.java:48)
        //   In order to prevent adminPojoConversion(AdminDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   adminPojoConversion(AdminDto).
        //   See https://diff.blue/R013 to resolve this issue.

        (new DtoPojoConverter<>()).adminPojoConversion(null);
    }

    /**
     * Method under test: {@link DtoPojoConverter#adminPojoConversion(AdminDto)}
     */
    @Test
    void testAdminPojoConversion4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.adminPojoConversion(DtoPojoConverter.java:48)
        //   In order to prevent adminPojoConversion(AdminDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   adminPojoConversion(AdminDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        AdminDto adminDto = mock(AdminDto.class);
        when(adminDto.getPassword()).thenReturn("iloveyou");
        when(adminDto.getLastName()).thenReturn("Doe");
        when(adminDto.getFirstName()).thenReturn("Jane");
        when(adminDto.getAdminName()).thenReturn("Admin Name");
        Admin actualAdminPojoConversionResult = dtoPojoConverter.adminPojoConversion(adminDto);
        assertNull(actualAdminPojoConversionResult.getAdminId());
        assertEquals("iloveyou", actualAdminPojoConversionResult.getPassword());
        assertNull(actualAdminPojoConversionResult.getLoginTime());
        assertNull(actualAdminPojoConversionResult.getLogOutTime());
        assertEquals("DOE", actualAdminPojoConversionResult.getLastName());
        assertEquals("JANE", actualAdminPojoConversionResult.getFirstName());
        assertNull(actualAdminPojoConversionResult.getCreatedDate());
        assertEquals("ADMIN NAME", actualAdminPojoConversionResult.getAdminName());
        verify(adminDto).getAdminName();
        verify(adminDto).getFirstName();
        verify(adminDto).getLastName();
        verify(adminDto).getPassword();
    }

    /**
     * Method under test: {@link DtoPojoConverter#trainPojoConversion(TrainDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testTrainPojoConversion() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.trainPojoConversion(DtoPojoConverter.java:58)
        //   In order to prevent trainPojoConversion(TrainDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   trainPojoConversion(TrainDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.trainPojoConversion(DtoPojoConverter.java:58)
        //   In order to prevent trainPojoConversion(TrainDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   trainPojoConversion(TrainDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        dtoPojoConverter.trainPojoConversion(new TrainDto());
    }

    /**
     * Method under test: {@link DtoPojoConverter#trainPojoConversion(TrainDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testTrainPojoConversion2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.trainPojoConversion(DtoPojoConverter.java:58)
        //   In order to prevent trainPojoConversion(TrainDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   trainPojoConversion(TrainDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.trainPojoConversion(DtoPojoConverter.java:59)
        //   In order to prevent trainPojoConversion(TrainDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   trainPojoConversion(TrainDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();

        TrainDto trainDto = new TrainDto();
        trainDto.setName("Name");
        dtoPojoConverter.trainPojoConversion(trainDto);
    }

    /**
     * Method under test: {@link DtoPojoConverter#trainPojoConversion(TrainDto)}
     */
    @Test
    void testTrainPojoConversion3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.trainPojoConversion(DtoPojoConverter.java:58)
        //   In order to prevent trainPojoConversion(TrainDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   trainPojoConversion(TrainDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();

        TrainDto trainDto = new TrainDto(1, "Name", "Code", new HashMap<>(), true, true, true, true, true, true);
        trainDto.setName("com.casestudy.reservation.dto.TrainDto");
        Train actualTrainPojoConversionResult = dtoPojoConverter.trainPojoConversion(trainDto);
        assertEquals("CODE", actualTrainPojoConversionResult.getCode());
        assertTrue(actualTrainPojoConversionResult.isThirdAC());
        assertTrue(actualTrainPojoConversionResult.isSleeper());
        assertFalse(actualTrainPojoConversionResult.isSecondAC());
        assertTrue(actualTrainPojoConversionResult.isFirstAC());
        assertTrue(actualTrainPojoConversionResult.isChairAC());
        assertTrue(actualTrainPojoConversionResult.isChair());
        assertTrue(actualTrainPojoConversionResult.getTierCosts().isEmpty());
        assertEquals("COM.CASESTUDY.RESERVATION.DTO.TRAINDTO", actualTrainPojoConversionResult.getName());
        assertNull(actualTrainPojoConversionResult.getId());
    }

    /**
     * Method under test: {@link DtoPojoConverter#trainPojoConversion(TrainDto)}
     */
    @Test
    void testTrainPojoConversion4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.trainPojoConversion(DtoPojoConverter.java:58)
        //   In order to prevent trainPojoConversion(TrainDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   trainPojoConversion(TrainDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();

        TrainDto trainDto = new TrainDto(1, "Name", "Code", new HashMap<>(), false, true, true, true, true, true);
        trainDto.setName("com.casestudy.reservation.dto.TrainDto");
        Train actualTrainPojoConversionResult = dtoPojoConverter.trainPojoConversion(trainDto);
        assertEquals("CODE", actualTrainPojoConversionResult.getCode());
        assertTrue(actualTrainPojoConversionResult.isThirdAC());
        assertFalse(actualTrainPojoConversionResult.isSleeper());
        assertFalse(actualTrainPojoConversionResult.isSecondAC());
        assertTrue(actualTrainPojoConversionResult.isFirstAC());
        assertTrue(actualTrainPojoConversionResult.isChairAC());
        assertTrue(actualTrainPojoConversionResult.isChair());
        assertTrue(actualTrainPojoConversionResult.getTierCosts().isEmpty());
        assertEquals("COM.CASESTUDY.RESERVATION.DTO.TRAINDTO", actualTrainPojoConversionResult.getName());
        assertNull(actualTrainPojoConversionResult.getId());
    }

    /**
     * Method under test: {@link DtoPojoConverter#schedulePojoConversion(ScheduleDto)}
     */
    @Test
    void testSchedulePojoConversion() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.schedulePojoConversion(DtoPojoConverter.java:71)
        //   In order to prevent schedulePojoConversion(ScheduleDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   schedulePojoConversion(ScheduleDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        Schedule actualSchedulePojoConversionResult = dtoPojoConverter.schedulePojoConversion(
                new ScheduleDto("Train Name", "42", "Station Name", "Station Code", "Arrival", "Departure"));
        assertEquals("Arrival", actualSchedulePojoConversionResult.getArrival());
        assertEquals("42", actualSchedulePojoConversionResult.getTrainNumber());
        assertEquals("TRAIN NAME", actualSchedulePojoConversionResult.getTrainName());
        assertEquals("STATION NAME", actualSchedulePojoConversionResult.getStationName());
        assertEquals("STATION CODE", actualSchedulePojoConversionResult.getStationCode());
        assertNull(actualSchedulePojoConversionResult.getId());
        assertEquals("Departure", actualSchedulePojoConversionResult.getDeparture());
    }

    /**
     * Method under test: {@link DtoPojoConverter#schedulePojoConversion(ScheduleDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSchedulePojoConversion2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.schedulePojoConversion(DtoPojoConverter.java:71)
        //   In order to prevent schedulePojoConversion(ScheduleDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   schedulePojoConversion(ScheduleDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.schedulePojoConversion(DtoPojoConverter.java:71)
        //   In order to prevent schedulePojoConversion(ScheduleDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   schedulePojoConversion(ScheduleDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        dtoPojoConverter.schedulePojoConversion(new ScheduleDto());
    }

    /**
     * Method under test: {@link DtoPojoConverter#schedulePojoConversion(ScheduleDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSchedulePojoConversion3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.schedulePojoConversion(DtoPojoConverter.java:71)
        //   In order to prevent schedulePojoConversion(ScheduleDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   schedulePojoConversion(ScheduleDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.schedulePojoConversion(DtoPojoConverter.java:71)
        //   In order to prevent schedulePojoConversion(ScheduleDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   schedulePojoConversion(ScheduleDto).
        //   See https://diff.blue/R013 to resolve this issue.

        (new DtoPojoConverter<>()).schedulePojoConversion(null);
    }

    /**
     * Method under test: {@link DtoPojoConverter#schedulePojoConversion(ScheduleDto)}
     */
    @Test
    void testSchedulePojoConversion4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.schedulePojoConversion(DtoPojoConverter.java:71)
        //   In order to prevent schedulePojoConversion(ScheduleDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   schedulePojoConversion(ScheduleDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        ScheduleDto scheduleDto = mock(ScheduleDto.class);
        when(scheduleDto.getArrival()).thenReturn("Arrival");
        when(scheduleDto.getDeparture()).thenReturn("Departure");
        when(scheduleDto.getTrainNumber()).thenReturn("42");
        when(scheduleDto.getTrainName()).thenReturn("Train Name");
        when(scheduleDto.getStationCode()).thenReturn("Station Code");
        when(scheduleDto.getStationName()).thenReturn("Station Name");
        Schedule actualSchedulePojoConversionResult = dtoPojoConverter.schedulePojoConversion(scheduleDto);
        assertEquals("Arrival", actualSchedulePojoConversionResult.getArrival());
        assertEquals("42", actualSchedulePojoConversionResult.getTrainNumber());
        assertEquals("TRAIN NAME", actualSchedulePojoConversionResult.getTrainName());
        assertEquals("STATION NAME", actualSchedulePojoConversionResult.getStationName());
        assertEquals("STATION CODE", actualSchedulePojoConversionResult.getStationCode());
        assertNull(actualSchedulePojoConversionResult.getId());
        assertEquals("Departure", actualSchedulePojoConversionResult.getDeparture());
        verify(scheduleDto).getArrival();
        verify(scheduleDto).getDeparture();
        verify(scheduleDto).getStationCode();
        verify(scheduleDto).getStationName();
        verify(scheduleDto).getTrainName();
        verify(scheduleDto).getTrainNumber();
    }

    /**
     * Method under test: {@link DtoPojoConverter#stationPojoConversion(StationsDto)}
     */
    @Test
    void testStationPojoConversion() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.stationPojoConversion(DtoPojoConverter.java:83)
        //   In order to prevent stationPojoConversion(StationsDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   stationPojoConversion(StationsDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        Stations actualStationPojoConversionResult = dtoPojoConverter
                .stationPojoConversion(new StationsDto("Station Name", "Station Code"));
        assertNull(actualStationPojoConversionResult.getId());
        assertEquals("STATION NAME", actualStationPojoConversionResult.getStationName());
        assertEquals("STATION CODE", actualStationPojoConversionResult.getStationCode());
    }

    /**
     * Method under test: {@link DtoPojoConverter#stationPojoConversion(StationsDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testStationPojoConversion2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.stationPojoConversion(DtoPojoConverter.java:83)
        //   In order to prevent stationPojoConversion(StationsDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   stationPojoConversion(StationsDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.stationPojoConversion(DtoPojoConverter.java:83)
        //   In order to prevent stationPojoConversion(StationsDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   stationPojoConversion(StationsDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        dtoPojoConverter.stationPojoConversion(new StationsDto());
    }

    /**
     * Method under test: {@link DtoPojoConverter#stationPojoConversion(StationsDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testStationPojoConversion3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.stationPojoConversion(DtoPojoConverter.java:83)
        //   In order to prevent stationPojoConversion(StationsDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   stationPojoConversion(StationsDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.stationPojoConversion(DtoPojoConverter.java:83)
        //   In order to prevent stationPojoConversion(StationsDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   stationPojoConversion(StationsDto).
        //   See https://diff.blue/R013 to resolve this issue.

        (new DtoPojoConverter<>()).stationPojoConversion(null);
    }

    /**
     * Method under test: {@link DtoPojoConverter#stationPojoConversion(StationsDto)}
     */
    @Test
    void testStationPojoConversion4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.stationPojoConversion(DtoPojoConverter.java:83)
        //   In order to prevent stationPojoConversion(StationsDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   stationPojoConversion(StationsDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();
        StationsDto stationsDto = mock(StationsDto.class);
        when(stationsDto.getStationCode()).thenReturn("Station Code");
        when(stationsDto.getStationName()).thenReturn("Station Name");
        Stations actualStationPojoConversionResult = dtoPojoConverter.stationPojoConversion(stationsDto);
        assertNull(actualStationPojoConversionResult.getId());
        assertEquals("STATION NAME", actualStationPojoConversionResult.getStationName());
        assertEquals("STATION CODE", actualStationPojoConversionResult.getStationCode());
        verify(stationsDto).getStationCode();
        verify(stationsDto).getStationName();
    }

    /**
     * Method under test: {@link DtoPojoConverter#stationPojoConversion(StationsDto)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testStationPojoConversion5() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.stationPojoConversion(DtoPojoConverter.java:83)
        //   In order to prevent stationPojoConversion(StationsDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   stationPojoConversion(StationsDto).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.casestudy.reservation.util.DtoPojoConverter.stationPojoConversion(DtoPojoConverter.java:84)
        //   In order to prevent stationPojoConversion(StationsDto)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   stationPojoConversion(StationsDto).
        //   See https://diff.blue/R013 to resolve this issue.

        DtoPojoConverter<Object> dtoPojoConverter = new DtoPojoConverter<>();

        StationsDto stationsDto = new StationsDto();
        stationsDto.setStationName("Station Name");
        dtoPojoConverter.stationPojoConversion(stationsDto);
    }
}

