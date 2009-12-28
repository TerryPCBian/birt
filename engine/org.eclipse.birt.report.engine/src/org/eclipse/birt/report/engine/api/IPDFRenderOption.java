/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.engine.api;

/**
 * Defines render options for PDF emitter.
 */
public interface IPDFRenderOption extends IRenderOption
{	
	/**
	 * @deprecated
	 *  Scale the content to fit into the page, when the content exceeds page size.
	 *  This property has been deprecated, please set PAGE_OVERFLOW = FIT_TO_PAGE_SIZE instead.
	 */
	public static final String FIT_TO_PAGE = "pdfRenderOption.fitToPage";
	
	/**
	 * @deprecated
	 *  The flag to indicate whether PDF layout use auto page break or not.
	 *  if it is set to true, then auto page break will not take effect.
	 *  This property has been deprecated, please set PAGE_OVERFLOW = OUTPUT_TO_MULTIPLE_PAGES instead.
	 */
	public static final String PAGEBREAK_PAGINATION_ONLY = "pdfRenderOption.pagebreakPaginationOnly";
		
	/**
	 * Properties to control how to output the content 
	 * if the content exceeds the page-size.
  	 *  CLIP_CONTENT:             clip the content
  	 *	FIT_TO_PAGE_SIZE:         scale the content to fit into the page
  	 *	OUTPUT_TO_MULTIPLE_PAGES: divided the content into multiple pages
  	 *	ENLARGE_PAGE_SIZE:        enlarge the page size to contain all the content.
	 */
	public static final String PAGE_OVERFLOW = "pdfRenderOption.pageOverflow";
	
	public static final int CLIP_CONTENT = 1;
	public static final int FIT_TO_PAGE_SIZE = 2;
	public static final int OUTPUT_TO_MULTIPLE_PAGES = 4;
	public static final int ENLARGE_PAGE_SIZE = 8;

	/**
	 * If it is set to false, all the text should be displayed into one line,
	 * the text which can not be displayed in the line will be clipped.
	 */
	public static final String PDF_TEXT_WRAPPING = "pdfRenderOption.textWrapping";
	
	/**
	 * If it is set to false, no hyphenation is used. 
	 * The word longer than the line width will be clipped at the line boundary.
	 */
	public static final String PDF_HYPHENATION = "pdfRenderOption.hyphenation";
	
	/**
	 * If it is set to false, we needn't check if the character exists in the selected font.
	 */
	public static final String PDF_FONT_SUBSTITUTION = "pdfRenderOption.fontSubstitution";
	
	/**
	 * If it is set to false, no BIDI processing is used.
	 */
	public static final String PDF_BIDI_PROCESSING = "pdfRenderOption.bidiProcessing";
	
	/**
	 * The customer defined DPI setting for image display. 
	 */
	public static final String DPI = IRenderOption.RENDER_DPI;
	
	/**
	 * @deprecated
	 * define the font directory used by PDF.
	 */
	public static final String FONT_DIRECTORY = "pdfRenderOption.fontDirectory";

	/**
	 * @deprecated
	 * should the true-type font be embedded into the generated PDF file. 
	 */
	public static final String IS_EMBEDDED_FONT = "pdfRenderOption.embeddedFonts";
	
	/**
	 * @deprecated
	 * @param isEmbededFont
	 */
	public void setEmbededFont( boolean isEmbededFont );
	
	/**
	 * @deprecated
	 * @return if font is embedded
	 */
	public boolean isEmbededFont( );

	/**
	 * @deprecated
	 * @return the user-defined font directory
	 */
	public String getFontDirectory( );

	/**
	 * @deprecated
	 * @param fontDirectory
	 *            the user-defined font directory
	 */
	public void setFontDirectory( String fontDirectory );
}
