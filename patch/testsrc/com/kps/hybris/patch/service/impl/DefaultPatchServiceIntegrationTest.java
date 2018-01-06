/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.kps.hybris.patch.service.impl;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;

import com.kps.hybris.patch.service.PatchService;


/**
 * This is an example of how the integration test should look like. {@link ServicelayerBaseTest} bootstraps platform so
 * you have an access to all Spring beans as well as database connection. It also ensures proper cleaning out of items
 * created during the test after it finishes. You can inject any Spring service using {@link Resource} annotation. Keep
 * in mind that by default it assumes that annotated field name matches the Spring Bean ID.
 */
@IntegrationTest
public class DefaultPatchServiceIntegrationTest extends ServicelayerBaseTest
{
	@Resource
	private PatchService patchService;
	@Resource
	private FlexibleSearchService flexibleSearchService;

	@Before
	public void setUp() throws Exception
	{
		//
	}

	@Test
	public void shouldReturnProperUrlForLogo() throws Exception
	{
		// given
		//		final String logoCode = "patchPlatformLogo";

		// when
		//		final String logoUrl = patchService.getHybrisLogoUrl(logoCode);

		// then
		//		assertThat(logoUrl).isNotNull();
		//		assertThat(logoUrl).isEqualTo(findLogoMedia(logoCode).getURL());
	}

}
