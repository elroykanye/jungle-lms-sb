package com.elroykanye.junglelms.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "institution")
public class Institution {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Long institutionId;
}
