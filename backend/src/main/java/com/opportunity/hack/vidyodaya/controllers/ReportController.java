package com.opportunity.hack.vidyodaya.controllers;

import com.opportunity.hack.vidyodaya.models.Report;
import com.opportunity.hack.vidyodaya.services.ReportService;
import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/reports")
public class ReportController {

  private final ReportService reportService;

  public ReportController(ReportService reportService) {
    this.reportService = reportService;
  }

  @GetMapping(value = "/reports", produces = "application/json")
  public ResponseEntity<?> listAllPosts() {
    List<Report> reports = reportService.findAll();
    return new ResponseEntity<>(reports, HttpStatus.OK);
  }

  @GetMapping(value = "/report/{id}", produces = "application/json")
  public ResponseEntity<?> getReportById(@PathVariable long id) {
    Report r = reportService.findReportById(id);
    return new ResponseEntity<>(r, HttpStatus.OK);
  }

  @PostMapping(value = "/reports", consumes = "application/json")
  public ResponseEntity<?> addNewReport(@Valid @RequestBody Report newReport) {
    newReport.setReportId(0);
    newReport = reportService.save(newReport);

    // set the location header for the newly created resource
    HttpHeaders responseHeaders = new HttpHeaders();
    URI newUserURI = ServletUriComponentsBuilder
      .fromCurrentRequest()
      .path("/{id}")
      .buildAndExpand(newReport.getReportId())
      .toUri();
    responseHeaders.setLocation(newUserURI);

    return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
  }

  @PatchMapping(value = "/report/{id}", consumes = "application/json")
  public ResponseEntity<?> updateReport(
    @RequestBody Report updateReport,
    @PathVariable long id
  ) {
    reportService.update(updateReport, id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @DeleteMapping(value = "/report/{id}")
  public ResponseEntity<?> deleteReportById(@PathVariable long id) {
    reportService.delete(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
