package com.frostmaster.email.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

@Data
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Email {

    @ApiModelProperty(value = "Send to")
    @NotBlank
    private String to;

    @ApiModelProperty(value = "Sent from")
    private String from;

    @ApiModelProperty(value = "Subject")
    private String subject;

    @ApiModelProperty(value = "Send copy to")
    @NotBlank
    private String cc;

    @ApiModelProperty(value = "Email body")
    private String body;

}